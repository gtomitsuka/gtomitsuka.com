public class Baumtraversierung {
  public Baumtraversierung() {
  
  }
  public void preorder(BinaryTree pBaum) {
    if(pBaum != null) {
      if(pBaum.getContent() != null) {
        System.out.println(pBaum.getContent());
      }
      this.preorder(pBaum.getLeftTree());
      this.preorder(pBaum.getRightTree());
    }
  }
  
  public void inorder(BinaryTree pBaum) {
    if(pBaum != null) {
      this.inorder(pBaum.getLeftTree());
      if(pBaum.getContent() != null) {
        System.out.println(pBaum.getContent());
      }
      this.inorder(pBaum.getRightTree());
    }
  }
  
  public void postorder(BinaryTree pBaum) {
    if(pBaum != null) {
      this.postorder(pBaum.getLeftTree());
      this.postorder(pBaum.getRightTree());
      if(pBaum.getContent() != null) {
        System.out.println(pBaum.getContent());
      }
    }
  }
}

