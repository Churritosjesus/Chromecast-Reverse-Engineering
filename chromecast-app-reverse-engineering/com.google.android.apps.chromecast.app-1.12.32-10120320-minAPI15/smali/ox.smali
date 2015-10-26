.class final Lox;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lqq;


# instance fields
.field private a:Z

.field private synthetic b:Lou;


# direct methods
.method constructor <init>(Lou;)V
    .locals 0

    .prologue
    .line 574
    iput-object p1, p0, Lox;->b:Lou;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lqa;Z)V
    .locals 2

    .prologue
    .line 588
    iget-boolean v0, p0, Lox;->a:Z

    if-eqz v0, :cond_0

    .line 598
    :goto_0
    return-void

    .line 592
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lox;->a:Z

    .line 593
    iget-object v0, p0, Lox;->b:Lou;

    .line 3050
    iget-object v0, v0, Lou;->a:Lse;

    .line 593
    invoke-interface {v0}, Lse;->l()V

    .line 594
    iget-object v0, p0, Lox;->b:Lou;

    .line 4050
    iget-object v0, v0, Lou;->c:Landroid/view/Window$Callback;

    .line 594
    if-eqz v0, :cond_1

    .line 595
    iget-object v0, p0, Lox;->b:Lou;

    .line 5050
    iget-object v0, v0, Lou;->c:Landroid/view/Window$Callback;

    .line 595
    const/16 v1, 0x8

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 597
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lox;->a:Z

    goto :goto_0
.end method

.method public final a_(Lqa;)Z
    .locals 2

    .prologue
    .line 579
    iget-object v0, p0, Lox;->b:Lou;

    .line 1050
    iget-object v0, v0, Lou;->c:Landroid/view/Window$Callback;

    .line 579
    if-eqz v0, :cond_0

    .line 580
    iget-object v0, p0, Lox;->b:Lou;

    .line 2050
    iget-object v0, v0, Lou;->c:Landroid/view/Window$Callback;

    .line 580
    const/16 v1, 0x8

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 581
    const/4 v0, 0x1

    .line 583
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
