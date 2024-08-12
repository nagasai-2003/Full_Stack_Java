class Strings {
    static void swap(char[] chararray, int idx1, int idx2){
        char temp = chararray[idx1];
        chararray[idx1] = chararray[idx2];
        chararray[idx2] = temp;
    }
    public static void main(String[] args) {
        String name = "Naga Sai";
        String name2 = new String();
        String name3 = new String("DJSAI");
        char[] chararr = {'H','e','m','a'};
        name2 = "Kavya";
        String name4 = new String(chararr);
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);

        // Strings are Immutable
       // name[0] = "B" ; -- ERROR
        System.out.println(name);
        name = name + " is Good Boy";
        System.out.println(name);

        // String Constant Pool
        String str1 = "Naga Sai";
        String str2 = "Naga Sai";
        System.out.printf("is %s and %s are Equal : %s\n",str1,str2,str1==str2);

        String str3 = new String("DJSAI");
        String str4 = new String("DJSAI");
        System.out.printf("is %s and %s are Equal : %s\n",str3,str3,str3==str4);

        System.out.printf("is %s and %s are Equal by using String.equals: %s\n",str3,str3,str3.equals(str4));

        // Checking Memory Reference
        System.out.println("Memory address of str1: "+System.identityHashCode(str1));
        System.out.println("Memory address of str2: "+System.identityHashCode(str2));
        System.out.println("Memory address of str3: "+System.identityHashCode(str3));
        System.out.println("Memory address of str4: "+System.identityHashCode(str4));


        // Operations on Strings
        // Concatenation
        System.out.println("Concatenation");
        String string1 = "Naga ";
        String string2 = "Sai";
        System.out.println(string1+" ,"+string2);
        String string3 = string1+string2;
        System.out.println(string3);
        String string4 = string1.concat(string2);
        System.out.println(string4);

        // Length of String
        System.err.println("String Length: "+string1.length());

        // String Comparision
        System.out.println("Comparision");
        String string5 = "Naga";
        String string6 = "Naga";
        String string7 = "naga";
        System.out.println(string5==string6);
        System.out.println(string5.equals(string6));
        System.out.println(string5.equalsIgnoreCase(string7));

        // Substring
        String string8 = "Something Inoffensive";
        System.out.println(string8.substring(0,4));
        String substring = string8.substring(4,9);
        System.out.println(substring);
        
        // Accessing Character
        String string9 = "Iron Man";
        System.out.println("Using CharAt() to get the Charater in String: "+string9.charAt(5));
        // This CharAt() method return char not String

        // Changing to UpperCase or LowerCase
        String string10 = "Naga Sai";
        System.out.println("String toUpperCase: "+string10.toUpperCase());
        System.out.println("String toLowerCase: "+string10.toLowerCase());

        // String Trimming
        String untrimmed = "              DJSAI                ";
        System.out.println("Untrimmed String: "+untrimmed);
        String trimmed = untrimmed.trim();
        System.out.println("Trimmed String: "+trimmed);

        // Replacing all the Characters
        String string11 = "mama manchodu";
        System.out.println("Original String: "+string11);
        string11 = string11.replace("m", "t");
        System.out.println("Replaced String: "+string11);
        string11 = string11.replace("tata", "mama");
        System.out.println("Replaced String: "+string11);

        // Contains
        String string12 = "Hello World";
        System.out.printf("is %s contains %s : %s",string12,"Hello",string12.contains("Hello"));

        // Split Method
        String string13 = "Naga Sai Bhavani Eswar";
        String[] names = string13.split(" ");
        System.out.println("Original String: "+string13);
        for(int i = 0; i<names.length; i++){
            System.out.println(names[i]);
        }
        // For Each Loop
        System.out.println("For Each Loop");
        for(String s : names){
            System.out.println(s);
        }
        int[] arr = {22,33,11,44,55,342,12,645,34};
        for(int i : arr){
            System.out.println(i);
        }

        // Sting Conversion to CharArray
        // You have to swap last 2 chars with first 2 chars
        String string14 = "Hello World";
        System.out.println("Unedited String: "+string14);
        char[] chararray = string14.toCharArray();
        // Changing in the Char Array By using Custom Swap method
        swap(chararray, 0, chararray.length-1);
        swap(chararray, 1, chararray.length-2);
        // Converting Chararray to String
        String chararraystring = new String(chararray);
        System.out.println("Edited String: "+chararraystring);
    }}