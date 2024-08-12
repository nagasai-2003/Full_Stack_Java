abstract class Reels_Abstract{
    abstract void swipe_up();
    void like(){
        System.out.println("You Have Liked The Post");
    }
    void comments(String comment){
        System.out.println("You Have Commented "+comment+" on this Post");
    }
    abstract void share(String Person);
}

class Reels extends Reels_Abstract{
    void swipe_up(){
        System.out.println("Here is a New Video");
    }
    void share(String Person){
        System.out.println("You have shared this Reel to "+Person);
    }
}
class Abstract_Class {
    public static void main(String[] args) {
        Reels reels = new Reels();
        reels.comments("NICE");
        reels.like();
        reels.swipe_up();
        reels.share("DJSAI");
    }
}