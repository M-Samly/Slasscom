public class Queue {
  int size;
  int items;
  int front, rear;
  private String queueArr[];

  public Queue(int size){
    this.size = size;
    queueArr = new Characters[size];
    front = 0;
    rear = -1;
    items = 0;
  }
  public boolean isFull(){
    return(items == size);
  }

  public boolean isEmpty(){
    return(items == 0);
  }

  public void insert(){
    if(isFull()){
      System.out.println("Queue Is Full");
    }else{
      if(rear == size -1){
        rear--;
      }
      Characters cha =new Characters(chara);
      queueArr[++rear] = cha;
      items++;

    }

    public Characters remove(){
      if(isEmpty()){
        return null;
      }else{
        if(front == size){
          front = 0;
        }
        items++;
      }
    }
  }



}