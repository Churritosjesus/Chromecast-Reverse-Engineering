.class final Lbng;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lats;


# instance fields
.field private synthetic a:Laow;

.field private synthetic b:Ljava/lang/String;

.field private synthetic c:Lboc;

.field private synthetic d:Lbmu;


# direct methods
.method constructor <init>(Lbmu;Laow;Ljava/lang/String;Lboc;)V
    .locals 0

    .prologue
    .line 1157
    iput-object p1, p0, Lbng;->d:Lbmu;

    iput-object p2, p0, Lbng;->a:Laow;

    iput-object p3, p0, Lbng;->b:Ljava/lang/String;

    iput-object p4, p0, Lbng;->c:Lboc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Bitmap;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 1160
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lbng;->a:Laow;

    invoke-virtual {v1}, Laow;->g()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v3

    iget-object v1, p0, Lbng;->b:Ljava/lang/String;

    aput-object v1, v0, v2

    .line 1161
    if-nez p1, :cond_1

    .line 1162
    new-array v0, v2, [Ljava/lang/Object;

    iget-object v1, p0, Lbng;->a:Laow;

    invoke-virtual {v1}, Laow;->g()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v3

    .line 2208
    :cond_0
    :goto_0
    return-void

    .line 1164
    :cond_1
    iget-object v0, p0, Lbng;->c:Lboc;

    .line 1245
    iget-object v0, v0, Lboc;->n:Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;

    .line 1164
    iget-object v1, p0, Lbng;->b:Ljava/lang/String;

    .line 2204
    iput-boolean v2, v0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->k:Z

    .line 2207
    iget-object v2, v0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->f:Ljava/lang/String;

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->f:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 2212
    iget-object v2, v0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->h:Ljava/lang/String;

    invoke-static {v2, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 2213
    iput-object p1, v0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->b:Landroid/graphics/Bitmap;

    .line 2224
    :goto_1
    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->invalidate()V

    goto :goto_0

    .line 2218
    :cond_2
    iput-object p1, v0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->d:Landroid/graphics/Bitmap;

    .line 2219
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xb

    if-lt v1, v2, :cond_3

    iget-object v1, v0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->a:Landroid/animation/ValueAnimator;

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 2220
    :cond_3
    iput-object p1, v0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->b:Landroid/graphics/Bitmap;

    goto :goto_1

    .line 2222
    :cond_4
    iget-object v1, v0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->a:Landroid/animation/ValueAnimator;

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    goto :goto_1
.end method
