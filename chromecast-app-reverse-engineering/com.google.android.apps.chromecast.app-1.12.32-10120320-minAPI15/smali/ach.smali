.class final Lach;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field private synthetic a:Lacb;


# direct methods
.method constructor <init>(Lacb;)V
    .locals 0

    .prologue
    .line 291
    iput-object p1, p0, Lach;->a:Lacb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4

    .prologue
    .line 295
    iget-object v0, p0, Lach;->a:Lacb;

    invoke-static {v0}, Lacb;->c(Lacb;)Landroid/widget/ListPopupWindow;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListPopupWindow;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 296
    iget-object v1, p0, Lach;->a:Lacb;

    iget-object v0, p0, Lach;->a:Lacb;

    invoke-static {v0}, Lacb;->d(Lacb;)Lada;

    move-result-object v2

    invoke-virtual {p1}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    move-result-object v0

    check-cast v0, Laby;

    .line 297
    invoke-virtual {v0, p3}, Laby;->a(I)Lacx;

    move-result-object v0

    .line 296
    invoke-virtual {v1, v2, v0}, Lacb;->a(Lada;Lacx;)V

    .line 298
    iget-object v0, p0, Lach;->a:Lacb;

    invoke-static {v0}, Lacb;->e(Lacb;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {}, Lacb;->h()I

    move-result v1

    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    .line 299
    iget-object v1, p0, Lach;->a:Lacb;

    invoke-static {v1}, Lacb;->c(Lacb;)Landroid/widget/ListPopupWindow;

    move-result-object v1

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 300
    iget-object v1, p0, Lach;->a:Lacb;

    invoke-static {v1}, Lacb;->e(Lacb;)Landroid/os/Handler;

    move-result-object v1

    const-wide/16 v2, 0x12c

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 301
    iget-object v0, p0, Lach;->a:Lacb;

    invoke-virtual {v0}, Lacb;->clearComposingText()V

    .line 302
    return-void
.end method
