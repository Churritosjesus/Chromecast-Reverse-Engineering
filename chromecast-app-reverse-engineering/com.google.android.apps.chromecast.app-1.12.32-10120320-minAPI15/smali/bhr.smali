.class final Lbhr;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field private synthetic a:Lbhf;


# direct methods
.method constructor <init>(Lbhf;)V
    .locals 0

    .prologue
    .line 200
    iput-object p1, p0, Lbhr;->a:Lbhf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    .prologue
    .line 204
    iget-object v0, p0, Lbhr;->a:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 205
    iget-object v0, p0, Lbhr;->a:Lbhf;

    invoke-static {v0, p2}, Lbhf;->b(Lbhf;Z)V

    .line 207
    :cond_0
    return-void
.end method
