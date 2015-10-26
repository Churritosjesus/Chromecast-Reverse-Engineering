.class public final Lalj;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field private synthetic a:Lcom/google/android/apps/chromecast/app/DebugActivity;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/DebugActivity;)V
    .locals 0

    .prologue
    .line 160
    iput-object p1, p0, Lalj;->a:Lcom/google/android/apps/chromecast/app/DebugActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lalj;->a:Lcom/google/android/apps/chromecast/app/DebugActivity;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1025
    const-string v0, "PREF_BLE_ENABLED"

    .line 1058
    invoke-static {}, Lblf;->b()Z

    .line 166
    return-void
.end method
