.class public final Lczu;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field private synthetic a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;


# direct methods
.method public constructor <init>(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)V
    .locals 0

    .prologue
    .line 589
    iput-object p1, p0, Lczu;->a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    .prologue
    .line 593
    iget-object v1, p0, Lczu;->a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-static {v1, v0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->a(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;F)F

    .line 594
    iget-object v0, p0, Lczu;->a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    invoke-static {v0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->c(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)Lczy;

    move-result-object v0

    iget-object v1, p0, Lczu;->a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    invoke-static {v1}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->b(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)F

    move-result v1

    invoke-virtual {v0, v1}, Lczy;->a(F)V

    .line 595
    iget-object v0, p0, Lczu;->a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    invoke-virtual {v0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->postInvalidateOnAnimation()V

    .line 596
    return-void
.end method
