.class final Lbmt;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Z

.field private synthetic b:Landroid/graphics/Bitmap;

.field private synthetic c:Lbms;


# direct methods
.method constructor <init>(Lbms;ZLandroid/graphics/Bitmap;)V
    .locals 0

    .prologue
    .line 82
    iput-object p1, p0, Lbmt;->c:Lbms;

    iput-boolean p2, p0, Lbmt;->a:Z

    iput-object p3, p0, Lbmt;->b:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 85
    iget-boolean v0, p0, Lbmt;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbmt;->c:Lbms;

    iget-boolean v0, v0, Lbms;->a:Z

    if-nez v0, :cond_0

    .line 86
    iget-object v0, p0, Lbmt;->c:Lbms;

    iget-object v0, v0, Lbms;->b:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    iget-object v1, p0, Lbmt;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 93
    :goto_0
    return-void

    .line 89
    :cond_0
    iget-object v0, p0, Lbmt;->c:Lbms;

    iget-object v0, v0, Lbms;->b:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->setAlpha(F)V

    .line 90
    iget-object v0, p0, Lbmt;->c:Lbms;

    iget-object v0, v0, Lbms;->b:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    iget-object v1, p0, Lbmt;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 91
    iget-object v0, p0, Lbmt;->c:Lbms;

    iget-object v0, v0, Lbms;->b:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v2, 0x258

    invoke-virtual {v0, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    goto :goto_0
.end method
