.class Lio;
.super Lim;
.source "PG"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 614
    invoke-direct {p0}, Lim;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Liw;)V
    .locals 2

    .prologue
    .line 617
    .line 1025
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Lit;

    invoke-direct {v1, p2, p1}, Lit;-><init>(Liw;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)Landroid/view/ViewPropertyAnimator;

    .line 618
    return-void
.end method
