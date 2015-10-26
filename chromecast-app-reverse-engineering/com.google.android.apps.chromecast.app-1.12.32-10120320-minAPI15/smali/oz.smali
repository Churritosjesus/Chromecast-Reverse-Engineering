.class final Loz;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lqq;


# instance fields
.field private synthetic a:Lou;


# direct methods
.method constructor <init>(Lou;)V
    .locals 0

    .prologue
    .line 601
    iput-object p1, p0, Loz;->a:Lou;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lqa;Z)V
    .locals 2

    .prologue
    .line 604
    iget-object v0, p0, Loz;->a:Lou;

    .line 1050
    iget-object v0, v0, Lou;->c:Landroid/view/Window$Callback;

    .line 604
    if-eqz v0, :cond_0

    .line 605
    iget-object v0, p0, Loz;->a:Lou;

    .line 2050
    iget-object v0, v0, Lou;->c:Landroid/view/Window$Callback;

    .line 605
    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 607
    :cond_0
    return-void
.end method

.method public final a_(Lqa;)Z
    .locals 2

    .prologue
    .line 611
    if-nez p1, :cond_0

    iget-object v0, p0, Loz;->a:Lou;

    .line 3050
    iget-object v0, v0, Lou;->c:Landroid/view/Window$Callback;

    .line 611
    if-eqz v0, :cond_0

    .line 612
    iget-object v0, p0, Loz;->a:Lou;

    .line 4050
    iget-object v0, v0, Lou;->c:Landroid/view/Window$Callback;

    .line 612
    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 614
    :cond_0
    const/4 v0, 0x1

    return v0
.end method
