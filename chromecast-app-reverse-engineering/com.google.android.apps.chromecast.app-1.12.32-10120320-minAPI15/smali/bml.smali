.class public final Lbml;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field private synthetic a:Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;)V
    .locals 0

    .prologue
    .line 76
    iput-object p1, p0, Lbml;->a:Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    .prologue
    .line 79
    iget-object v0, p0, Lbml;->a:Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result v1

    const/high16 v2, 0x437f0000    # 255.0f

    mul-float/2addr v1, v2

    float-to-int v1, v1

    invoke-static {v0, v1}, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->a(Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;I)I

    .line 80
    iget-object v0, p0, Lbml;->a:Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->invalidate()V

    .line 81
    return-void
.end method
