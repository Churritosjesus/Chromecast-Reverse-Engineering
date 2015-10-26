.class public final Lbmm;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# instance fields
.field private synthetic a:Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;)V
    .locals 0

    .prologue
    .line 84
    iput-object p1, p0, Lbmm;->a:Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    .prologue
    .line 88
    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .prologue
    .line 95
    iget-object v0, p0, Lbmm;->a:Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;

    iget-object v1, p0, Lbmm;->a:Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;

    invoke-static {v1}, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->a(Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->a(Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 96
    iget-object v0, p0, Lbmm;->a:Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;

    iget-object v1, p0, Lbmm;->a:Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;

    invoke-static {v1}, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->b(Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->b(Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 97
    iget-object v0, p0, Lbmm;->a:Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;

    iget-object v1, p0, Lbmm;->a:Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;

    invoke-static {v1}, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->c(Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->a(Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;Ljava/lang/String;)Ljava/lang/String;

    .line 98
    iget-object v0, p0, Lbmm;->a:Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;

    iget-object v1, p0, Lbmm;->a:Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;

    invoke-static {v1}, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->d(Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->b(Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;Ljava/lang/String;)Ljava/lang/String;

    .line 99
    iget-object v0, p0, Lbmm;->a:Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->a(Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;I)I

    .line 100
    return-void
.end method

.method public final onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    .prologue
    .line 104
    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    .prologue
    .line 108
    return-void
.end method
