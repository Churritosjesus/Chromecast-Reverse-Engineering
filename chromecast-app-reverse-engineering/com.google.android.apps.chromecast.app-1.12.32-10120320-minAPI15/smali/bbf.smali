.class public final Lbbf;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Ljava/lang/String;

.field private synthetic b:I

.field private synthetic c:Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 321
    iput-object p1, p0, Lbbf;->c:Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;

    iput-object p2, p0, Lbbf;->a:Ljava/lang/String;

    iput p3, p0, Lbbf;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 324
    iget-object v0, p0, Lbbf;->c:Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;

    iget-object v1, p0, Lbbf;->c:Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;

    iget-object v2, p0, Lbbf;->a:Ljava/lang/String;

    iget v3, p0, Lbbf;->b:I

    invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->a(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;Landroid/widget/Toast;)Landroid/widget/Toast;

    .line 325
    iget-object v0, p0, Lbbf;->c:Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->e(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 326
    return-void
.end method
