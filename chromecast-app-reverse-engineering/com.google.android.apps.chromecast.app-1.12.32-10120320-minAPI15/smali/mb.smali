.class final Lmb;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field private synthetic a:Llw;


# direct methods
.method constructor <init>(Llw;)V
    .locals 0

    .prologue
    .line 815
    iput-object p1, p0, Lmb;->a:Llw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    .prologue
    .line 823
    iget-object v0, p0, Lmb;->a:Llw;

    invoke-static {v0}, Llw;->f(Llw;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 824
    iget-object v0, p0, Lmb;->a:Llw;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Llw;->a(Llw;Landroid/view/animation/Animation$AnimationListener;)V

    .line 826
    :cond_0
    return-void
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 830
    return-void
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 819
    return-void
.end method
