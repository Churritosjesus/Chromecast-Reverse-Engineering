.class final Lyn;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lyc;


# direct methods
.method constructor <init>(Lyc;)V
    .locals 0

    .prologue
    .line 1724
    iput-object p1, p0, Lyn;->a:Lyc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 1726
    iget-object v0, p0, Lyn;->a:Lyc;

    invoke-static {v0}, Lyc;->a(Lyc;)Lyf;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lyn;->a:Lyc;

    invoke-static {v0}, Lyc;->a(Lyc;)Lyf;

    move-result-object v0

    invoke-virtual {v0}, Lyf;->getCount()I

    move-result v0

    iget-object v1, p0, Lyn;->a:Lyc;

    invoke-static {v1}, Lyc;->a(Lyc;)Lyf;

    move-result-object v1

    invoke-virtual {v1}, Lyf;->getChildCount()I

    move-result v1

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lyn;->a:Lyc;

    invoke-static {v0}, Lyc;->a(Lyc;)Lyf;

    move-result-object v0

    invoke-virtual {v0}, Lyf;->getChildCount()I

    move-result v0

    iget-object v1, p0, Lyn;->a:Lyc;

    iget v1, v1, Lyc;->e:I

    if-gt v0, v1, :cond_0

    .line 1728
    iget-object v0, p0, Lyn;->a:Lyc;

    invoke-static {v0}, Lyc;->b(Lyc;)Landroid/widget/PopupWindow;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 1729
    iget-object v0, p0, Lyn;->a:Lyc;

    invoke-virtual {v0}, Lyc;->c()V

    .line 1731
    :cond_0
    return-void
.end method
