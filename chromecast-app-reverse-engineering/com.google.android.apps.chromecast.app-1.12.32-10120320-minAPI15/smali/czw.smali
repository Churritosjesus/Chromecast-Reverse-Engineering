.class public final Lczw;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field private synthetic a:I

.field private synthetic b:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;


# direct methods
.method public constructor <init>(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;I)V
    .locals 0

    .prologue
    .line 625
    iput-object p1, p0, Lczw;->b:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    iput p2, p0, Lczw;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    .prologue
    .line 628
    iget-object v0, p0, Lczw;->b:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    iget v1, p0, Lczw;->a:I

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->a(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;IF)V

    .line 629
    return-void
.end method
