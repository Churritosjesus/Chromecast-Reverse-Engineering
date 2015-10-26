.class public final Lbms;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Laey;


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;Z)V
    .locals 0

    .prologue
    .line 64
    iput-object p1, p0, Lbms;->b:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    iput-boolean p2, p0, Lbms;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Laef;)V
    .locals 3

    .prologue
    .line 67
    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    if-nez p1, :cond_0

    const-string v0, "null"

    :goto_0
    aput-object v0, v1, v2

    .line 68
    return-void

    .line 67
    :cond_0
    invoke-virtual {p1}, Laef;->getMessage()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public final a(Laex;Z)V
    .locals 5

    .prologue
    const/4 v2, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 72
    iget-object v0, p0, Lbms;->b:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->a(Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;)Ljava/lang/String;

    move-result-object v0

    .line 1382
    iget-object v1, p1, Laex;->c:Ljava/lang/String;

    .line 72
    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 73
    new-array v0, v2, [Ljava/lang/Object;

    .line 2382
    iget-object v1, p1, Laex;->c:Ljava/lang/String;

    .line 74
    aput-object v1, v0, v3

    iget-object v1, p0, Lbms;->b:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    invoke-static {v1}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->a(Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v4

    .line 98
    :goto_0
    return-void

    .line 3375
    :cond_0
    iget-object v0, p1, Laex;->a:Landroid/graphics/Bitmap;

    .line 79
    if-eqz v0, :cond_1

    .line 80
    new-array v1, v2, [Ljava/lang/Object;

    .line 3382
    iget-object v2, p1, Laex;->c:Ljava/lang/String;

    .line 80
    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v1, v4

    .line 82
    iget-object v1, p0, Lbms;->b:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    new-instance v2, Lbmt;

    invoke-direct {v2, p0, p2, v0}, Lbmt;-><init>(Lbms;ZLandroid/graphics/Bitmap;)V

    invoke-virtual {v1, v2}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 96
    :cond_1
    new-array v0, v4, [Ljava/lang/Object;

    .line 4382
    iget-object v1, p1, Laex;->c:Ljava/lang/String;

    .line 96
    aput-object v1, v0, v3

    goto :goto_0
.end method
