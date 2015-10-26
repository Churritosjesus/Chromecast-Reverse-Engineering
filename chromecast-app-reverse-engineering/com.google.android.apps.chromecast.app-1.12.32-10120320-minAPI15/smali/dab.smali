.class final Ldab;
.super Landroid/animation/AnimatorListenerAdapter;
.source "PG"


# instance fields
.field private synthetic a:[I

.field private synthetic b:F

.field private synthetic c:F

.field private synthetic d:Lczy;


# direct methods
.method constructor <init>(Lczy;Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;[IFF)V
    .locals 0

    .prologue
    .line 809
    iput-object p1, p0, Ldab;->d:Lczy;

    iput-object p3, p0, Ldab;->a:[I

    iput p4, p0, Ldab;->b:F

    iput p5, p0, Ldab;->c:F

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .prologue
    const/high16 v1, -0x40800000    # -1.0f

    .line 824
    iget-object v0, p0, Ldab;->d:Lczy;

    iget-object v0, v0, Lczy;->a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    invoke-static {v0, v1}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->b(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;F)F

    .line 825
    iget-object v0, p0, Ldab;->d:Lczy;

    iget-object v0, v0, Lczy;->a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    invoke-static {v0, v1}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->c(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;F)F

    .line 826
    iget-object v0, p0, Ldab;->d:Lczy;

    iget-object v0, v0, Lczy;->a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    invoke-virtual {v0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->postInvalidateOnAnimation()V

    .line 827
    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 6

    .prologue
    .line 812
    iget-object v0, p0, Ldab;->d:Lczy;

    iget-object v0, v0, Lczy;->a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    invoke-static {v0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->k(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)V

    .line 813
    iget-object v0, p0, Ldab;->d:Lczy;

    iget-object v0, v0, Lczy;->a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    invoke-static {v0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->l(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)V

    .line 815
    iget-object v1, p0, Ldab;->a:[I

    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget v3, v1, v0

    .line 816
    iget-object v4, p0, Ldab;->d:Lczy;

    iget-object v4, v4, Lczy;->a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    const v5, 0x3727c5ac    # 1.0E-5f

    invoke-static {v4, v3, v5}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->b(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;IF)V

    .line 815
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 818
    :cond_0
    iget-object v0, p0, Ldab;->d:Lczy;

    iget-object v0, v0, Lczy;->a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    iget v1, p0, Ldab;->b:F

    invoke-static {v0, v1}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->b(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;F)F

    .line 819
    iget-object v0, p0, Ldab;->d:Lczy;

    iget-object v0, v0, Lczy;->a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    iget v1, p0, Ldab;->c:F

    invoke-static {v0, v1}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->c(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;F)F

    .line 820
    iget-object v0, p0, Ldab;->d:Lczy;

    iget-object v0, v0, Lczy;->a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    invoke-virtual {v0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->postInvalidateOnAnimation()V

    .line 821
    return-void
.end method
