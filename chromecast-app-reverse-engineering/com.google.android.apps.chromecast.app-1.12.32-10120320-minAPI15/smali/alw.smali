.class public final Lalw;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Laop;


# instance fields
.field private synthetic a:Lbfs;

.field private synthetic b:Landroid/app/AlertDialog;

.field private synthetic c:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;Lbfs;Landroid/app/AlertDialog;)V
    .locals 0

    .prologue
    .line 305
    iput-object p1, p0, Lalw;->c:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    iput-object p2, p0, Lalw;->a:Lbfs;

    iput-object p3, p0, Lalw;->b:Landroid/app/AlertDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .prologue
    .line 308
    iget-object v0, p0, Lalw;->c:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->w()V

    .line 310
    iget-object v0, p0, Lalw;->c:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    iget-object v1, p0, Lalw;->c:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    iget-object v1, v1, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->k:Ljava/lang/String;

    iput-object v1, v0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->j:Ljava/lang/String;

    .line 311
    iget-object v0, p0, Lalw;->c:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 2915
    iget-object v0, v0, Land;->i:Lbdf;

    .line 311
    iget-object v1, p0, Lalw;->c:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    iget-object v1, v1, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->j:Ljava/lang/String;

    .line 3423
    iput-object v1, v0, Lbdf;->u:Ljava/lang/String;

    .line 312
    iget-object v0, p0, Lalw;->c:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 3915
    iget-object v0, v0, Land;->i:Lbdf;

    .line 312
    iget-object v1, p0, Lalw;->a:Lbfs;

    .line 4130
    iget-object v1, v1, Lbfs;->a:Ljava/lang/String;

    .line 4455
    iput-object v1, v0, Lbdf;->y:Ljava/lang/String;

    .line 313
    iget-object v0, p0, Lalw;->c:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->a(Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 314
    iget-object v0, p0, Lalw;->c:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->b(Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;)Lbhf;

    move-result-object v0

    iget-object v1, p0, Lalw;->c:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 4915
    iget-object v1, v1, Land;->i:Lbdf;

    .line 5459
    iget-object v1, v1, Lbdf;->y:Ljava/lang/String;

    .line 5607
    iget-object v0, v0, Lbhf;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 315
    iget-object v0, p0, Lalw;->c:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->b(Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;)Lbhf;

    move-result-object v2

    iget-object v3, p0, Lalw;->a:Lbfs;

    .line 6111
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, v2, Lbhf;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 6112
    iget-object v0, v2, Lbhf;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbfs;

    .line 6130
    iget-object v0, v0, Lbfs;->a:Ljava/lang/String;

    .line 7130
    iget-object v4, v3, Lbfs;->a:Ljava/lang/String;

    .line 6112
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6113
    iget-object v0, v2, Lbhf;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 6117
    :cond_0
    iget-object v0, v2, Lbhf;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 317
    :cond_1
    return-void

    .line 6111
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 321
    iget-object v0, p0, Lalw;->c:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->w()V

    .line 322
    iget-object v0, p0, Lalw;->c:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 323
    iget-object v0, p0, Lalw;->b:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 325
    :cond_0
    return-void
.end method
