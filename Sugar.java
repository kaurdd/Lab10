class Sugar extends Cookie{
  String shape;
  boolean isDecorated;
  Sugar()
  {
    shape="";
    isDecorated=false;
  }
  Sugar(String a){
    shape=a;
    isDecorated=false;
  }
  String getShape(){
    return shape;
  }
  void changeShape(String a){
    shape=a;
  }
  void cutShapes(String a, int b){
    System.outprintln(b+"cookies were but into " +a);
    super.setNumCookie(b);
  }

  void decorate(){
    if(super.isReady()==true)
    {isDecorated=true;
    System.out.println("the cookies were decorated");
    }
    else{
      System.out.println("make sure to bak ethe cookies first");
    }
  }

  }




