.class final Lawz;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Ldbb;

.field private synthetic b:Lawr;


# direct methods
.method constructor <init>(Lawr;Ldbb;)V
    .locals 0

    .prologue
    .line 374
    iput-object p1, p0, Lawz;->b:Lawr;

    iput-object p2, p0, Lawz;->a:Ldbb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 8

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 377
    const/16 v2, 0x7a

    invoke-static {v2}, Lapg;->a(I)Lapg;

    move-result-object v2

    iget-object v3, p0, Lawz;->b:Lawr;

    .line 378
    invoke-static {v3}, Lawr;->e(Lawr;)Ljava/lang/String;

    move-result-object v3

    .line 1079
    iput-object v3, v2, Lapg;->c:Ljava/lang/String;

    .line 379
    invoke-virtual {v2}, Lapg;->b()V

    .line 380
    iget-object v2, p0, Lawz;->b:Lawr;

    .line 1612
    iget-object v2, v2, Lj;->y:Lm;

    .line 380
    const-string v3, "AIzaSyBdEFvybu3pLLqPgu8m3MvsdScdKFfD6vE"

    iget-object v4, p0, Lawz;->a:Ldbb;

    iget-object v4, v4, Ldbb;->b:Ljava/lang/String;

    .line 2000
    if-nez v4, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "The videoId cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance v5, Landroid/content/Intent;

    const-string v6, "com.google.android.youtube.api.StandalonePlayerActivity.START"

    invoke-direct {v5, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v6, "video_id"

    invoke-virtual {v5, v6, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v4

    .line 4000
    const-string v5, "app_package"

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v5

    const-string v6, "app_version"

    invoke-static {v2}, Ldaj;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v5

    const-string v6, "client_library_version"

    invoke-static {}, Ldaj;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 3000
    const-string v5, "developer_key"

    invoke-virtual {v4, v5, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v3

    const-string v5, "autoplay"

    invoke-virtual {v3, v5, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object v3

    const-string v5, "lightbox_mode"

    invoke-virtual {v3, v5, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object v3

    const-string v5, "start_time_millis"

    invoke-virtual {v3, v5, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object v3

    const-string v5, "window_has_status_bar"

    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v2

    iget v2, v2, Landroid/view/WindowManager$LayoutParams;->flags:I

    and-int/lit16 v2, v2, 0x400

    if-nez v2, :cond_1

    :goto_0
    invoke-virtual {v3, v5, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 384
    iget-object v0, p0, Lawz;->b:Lawr;

    invoke-virtual {v0, v4}, Lawr;->a(Landroid/content/Intent;)V

    .line 385
    return-void

    :cond_1
    move v0, v1

    .line 3000
    goto :goto_0
.end method
