.class final Ldaa;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field private synthetic a:Lczy;


# direct methods
.method constructor <init>(Lczy;Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)V
    .locals 0

    .prologue
    .line 795
    iput-object p1, p0, Ldaa;->a:Lczy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 5

    .prologue
    .line 799
    iget-object v0, p0, Ldaa;->a:Lczy;

    iget-object v1, v0, Lczy;->a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-static {v1, v0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->c(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;F)F

    .line 800
    iget-object v0, p0, Ldaa;->a:Lczy;

    iget-object v0, v0, Lczy;->a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    invoke-virtual {v0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->postInvalidateOnAnimation()V

    .line 802
    iget-object v0, p0, Ldaa;->a:Lczy;

    iget-object v0, v0, Lczy;->a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    invoke-static {v0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)[Ldac;

    move-result-object v1

    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, v1, v0

    .line 803
    iget-object v4, p0, Ldaa;->a:Lczy;

    iget-object v4, v4, Lczy;->a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    invoke-static {v4}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->j(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)F

    move-result v4

    invoke-virtual {v3, v4}, Ldac;->a(F)V

    .line 802
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 805
    :cond_0
    return-void
.end method
