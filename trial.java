class trial {

  public static void main(String[] args) {
    String[] arr = {
      "Mysoor Sada Dosa 75",
      "Mysoor Masala Dosa 85",
      "Uttapam (Onion/Tomato/Masala) 80",
      "Poha 50",
      "Upma",
    };
    for (String string : args) {
      System.out.println(
        "<"+"'li class="menu-item""'+">"+
        "<"+"'p class="item-name""+">"+"Medu Wada"+"</"+"p"+">"+
        "<"+"p class="price""+">"+"80 ₹"+"<"+"/p"+">"+
    "</"+"li"+">"
      );
    }
  }
}
