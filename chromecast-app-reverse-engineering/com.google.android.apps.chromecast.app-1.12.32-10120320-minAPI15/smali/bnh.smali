.class final Lbnh;
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
    .line 1171
    iput-object p1, p0, Lbnh;->d:Lbmu;

    iput-object p2, p0, Lbnh;->a:Laow;

    iput-object p3, p0, Lbnh;->b:Ljava/lang/String;

    iput-object p4, p0, Lbnh;->c:Lboc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Bitmap;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 1174
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lbnh;->a:Laow;

    invoke-virtual {v1}, Laow;->g()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v2

    iget-object v1, p0, Lbnh;->b:Ljava/lang/String;

    aput-object v1, v0, v3

    .line 1175
    if-nez p1, :cond_1

    .line 1176
    new-array v0, v3, [Ljava/lang/Object;

    iget-object v1, p0, Lbnh;->a:Laow;

    invoke-virtual {v1}, Laow;->g()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v2

    .line 2246
    :cond_0
    :goto_0
    return-void

    .line 1178
    :cond_1
    iget-object v0, p0, Lbnh;->c:Lboc;

    .line 1245
    iget-object v0, v0, Lboc;->n:Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;

    .line 1178
    iget-object v1, p0, Lbnh;->b:Ljava/lang/String;

    .line 2233
    iget-object v2, v0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->g:Ljava/lang/String;

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->g:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 2238
    iget-object v2, v0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->i:Ljava/lang/String;

    invoke-static {v2, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 2239
    iput-object p1, v0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->c:Landroid/graphics/Bitmap;

    .line 2240
    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->invalidate()V

    goto :goto_0

    .line 2244
    :cond_2
    iput-object p1, v0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->e:Landroid/graphics/Bitmap;

    .line 2245
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xb

    if-lt v1, v2, :cond_3

    iget-object v1, v0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->a:Landroid/animation/ValueAnimator;

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 2246
    :cond_3
    iput-object p1, v0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->c:Landroid/graphics/Bitmap;

    goto :goto_0

    .line 2248
    :cond_4
    iget-object v0, v0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->a:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    goto :goto_0
.end method
