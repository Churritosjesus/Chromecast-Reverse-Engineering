.class final Lbid;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbdn;


# instance fields
.field private synthetic a:Lbic;


# direct methods
.method constructor <init>(Lbic;)V
    .locals 0

    .prologue
    .line 262
    iput-object p1, p0, Lbid;->a:Lbic;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 262
    check-cast p1, Ljava/util/List;

    .line 3266
    iget-object v0, p0, Lbid;->a:Lbic;

    iget-object v0, v0, Lbic;->a:Lbhf;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0, v1}, Lbhf;->a(Lbhf;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 3267
    iget-object v0, p0, Lbid;->a:Lbic;

    iget-object v0, v0, Lbic;->a:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->y()V

    .line 3268
    iget-object v0, p0, Lbid;->a:Lbic;

    iget-object v0, v0, Lbic;->a:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    .line 3821
    iget-boolean v0, v0, Land;->u:Z

    .line 3268
    if-nez v0, :cond_0

    .line 3269
    iget-object v0, p0, Lbid;->a:Lbic;

    iget-object v0, v0, Lbic;->a:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->w()V

    .line 3270
    iget-object v0, p0, Lbid;->a:Lbic;

    iget-object v0, v0, Lbic;->a:Lbhf;

    invoke-virtual {v0}, Lbhf;->p()V

    .line 262
    :cond_0
    return-void
.end method

.method public final b_(I)V
    .locals 1

    .prologue
    .line 276
    iget-object v0, p0, Lbid;->a:Lbic;

    iget-object v0, v0, Lbic;->a:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    .line 2821
    iget-boolean v0, v0, Land;->u:Z

    .line 276
    if-eqz v0, :cond_0

    .line 277
    iget-object v0, p0, Lbid;->a:Lbic;

    iget-object v0, v0, Lbic;->a:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->y()V

    .line 282
    :goto_0
    return-void

    .line 281
    :cond_0
    iget-object v0, p0, Lbid;->a:Lbic;

    iget-object v0, v0, Lbic;->a:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->finish()V

    goto :goto_0
.end method
