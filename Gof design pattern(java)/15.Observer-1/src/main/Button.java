package main;

public class Button {



  public void onClick() {
    // �̺�Ʈ ó��
    if (onClickListener != null)
      onClickListener.onClick(this);
  }

  public interface OnClickListener {
    public void onClick(Button button);
  }

  private OnClickListener onClickListener;

  public OnClickListener getOnClickListener() {
    return onClickListener;
  }

  public void setOnClickListener(OnClickListener onClickListener) {
    this.onClickListener = onClickListener;
  }
}
