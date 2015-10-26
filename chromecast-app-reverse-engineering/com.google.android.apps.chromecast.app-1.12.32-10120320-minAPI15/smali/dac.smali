.class public final Ldac;
.super Ldaf;
.source "PG"


# instance fields
.field final synthetic a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

.field private final b:I


# direct methods
.method public constructor <init>(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;ILdah;)V
    .locals 2

    .prologue
    .line 839
    iput-object p1, p0, Ldac;->a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    .line 840
    invoke-direct {p0, p1, p3}, Ldaf;-><init>(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;Ldah;)V

    .line 841
    iput p2, p0, Ldac;->b:I

    .line 842
    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-virtual {p0, v0}, Ldac;->setFloatValues([F)V

    .line 843
    invoke-static {p1}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->d(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ldac;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 844
    invoke-static {p1}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->e(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)Landroid/view/animation/Interpolator;

    move-result-object v0

    invoke-virtual {p0, v0}, Ldac;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 846
    new-instance v0, Ldad;

    invoke-direct {v0, p0, p1}, Ldad;-><init>(Ldac;Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)V

    invoke-virtual {p0, v0}, Ldac;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 855
    new-instance v0, Ldae;

    invoke-direct {v0, p0, p1}, Ldae;-><init>(Ldac;Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)V

    invoke-virtual {p0, v0}, Ldac;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 862
    return-void

    .line 842
    nop

    :array_0
    .array-data 4
        0x3727c5ac    # 1.0E-5f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method static synthetic a(Ldac;)I
    .locals 1

    .prologue
    .line 835
    iget v0, p0, Ldac;->b:I

    return v0
.end method
