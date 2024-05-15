class SubString {
  public static void main(String[] args) {
    // create a string
    String str1= "Java Programming";
    String str2 = "Programming";

    // check if name is present in txt
    // using contains()
    Boolean result =str1.contains(str2);
    if(result) {
      System.out.println(str2 + " is present in the string.");
    }
    else {
      System.out.println(str2 + " is not present in the string.");
    }
  }
}