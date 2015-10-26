.class final Lst;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field private synthetic a:Lsr;


# direct methods
.method constructor <init>(Lsr;)V
    .locals 0

    .prologue
    .line 701
    iput-object p1, p0, Lst;->a:Lsr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 1

    .prologue
    .line 704
    iget-object v0, p0, Lst;->a:Lsr;

    invoke-static {v0}, Lsr;->a(Lsr;)Lta;

    move-result-object v0

    invoke-interface {v0}, Lta;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 705
    iget-object v0, p0, Lst;->a:Lsr;

    invoke-static {v0}, Lsr;->a(Lsr;)Lta;

    move-result-object v0

    invoke-interface {v0}, Lta;->c()V

    .line 707
    :cond_0
    iget-object v0, p0, Lst;->a:Lsr;

    invoke-virtual {v0}, Lsr;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 708
    if-eqz v0, :cond_1

    .line 709
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 711
    :cond_1
    return-void
.end method
