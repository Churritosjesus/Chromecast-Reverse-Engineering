.class final Ldad;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field private synthetic a:Ldac;


# direct methods
.method constructor <init>(Ldac;Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)V
    .locals 0

    .prologue
    .line 846
    iput-object p1, p0, Ldad;->a:Ldac;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    .prologue
    .line 850
    iget-object v0, p0, Ldad;->a:Ldac;

    iget-object v1, v0, Ldac;->a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    iget-object v0, p0, Ldad;->a:Ldac;

    invoke-static {v0}, Ldac;->a(Ldac;)I

    move-result v2

    .line 851
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    .line 850
    invoke-static {v1, v2, v0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->b(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;IF)V

    .line 852
    return-void
.end method
