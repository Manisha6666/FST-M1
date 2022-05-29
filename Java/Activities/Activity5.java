package activities;

public  class Activity5  extends Book{
    public void setTitle(String s)
    {
        title = s;
    }
    public static void main(String[] args)
    {
        Activity5 newNovel = new Activity5();
        newNovel.setTitle("Computer Science");
        System.out.println("The title is :"+newNovel.getTitle());
    }
}
