.class final Lnt;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lqq;


# instance fields
.field private synthetic a:Lno;


# direct methods
.method constructor <init>(Lno;)V
    .locals 0

    .prologue
    .line 1564
    iput-object p1, p0, Lnt;->a:Lno;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lqa;Z)V
    .locals 1

    .prologue
    .line 1576
    iget-object v0, p0, Lnt;->a:Lno;

    .line 3089
    invoke-virtual {v0, p1}, Lno;->b(Lqa;)V

    .line 1577
    return-void
.end method

.method public final a_(Lqa;)Z
    .locals 2

    .prologue
    .line 1567
    iget-object v0, p0, Lnt;->a:Lno;

    .line 2233
    iget-object v0, v0, Lni;->b:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    .line 1568
    if-eqz v0, :cond_0

    .line 1569
    const/16 v1, 0x8

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 1571
    :cond_0
    const/4 v0, 0x1

    return v0
.end method
