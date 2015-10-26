.class public final Lit;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field private synthetic a:Liw;

.field private synthetic b:Landroid/view/View;


# direct methods
.method public constructor <init>(Liw;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 25
    iput-object p1, p0, Lit;->a:Liw;

    iput-object p2, p0, Lit;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lit;->a:Liw;

    invoke-interface {v0}, Liw;->a()V

    .line 29
    return-void
.end method
