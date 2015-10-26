.class final Laci;
.super Landroid/os/Handler;
.source "PG"


# direct methods
.method constructor <init>(Lacb;)V
    .locals 0

    .prologue
    .line 307
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 2

    .prologue
    .line 310
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {}, Lacb;->h()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 311
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/widget/ListPopupWindow;

    invoke-virtual {v0}, Landroid/widget/ListPopupWindow;->dismiss()V

    .line 315
    :goto_0
    return-void

    .line 314
    :cond_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    goto :goto_0
.end method
