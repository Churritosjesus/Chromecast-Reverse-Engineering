.class public final Lbje;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field public final a:Landroid/os/Handler;

.field public final b:Ljava/lang/Runnable;

.field final c:Lbdm;

.field final d:Lbdn;

.field public e:Z

.field private final f:Lblp;


# direct methods
.method public constructor <init>(Lbdm;)V
    .locals 2

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Lblp;

    const-string v1, "SoundPlayerRefresher"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lbje;->f:Lblp;

    .line 28
    iput-object p1, p0, Lbje;->c:Lbdm;

    .line 29
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lbje;->a:Landroid/os/Handler;

    .line 31
    new-instance v0, Lbjf;

    invoke-direct {v0, p0}, Lbjf;-><init>(Lbje;)V

    iput-object v0, p0, Lbje;->d:Lbdn;

    .line 49
    new-instance v0, Lbjg;

    invoke-direct {v0, p0}, Lbjg;-><init>(Lbje;)V

    iput-object v0, p0, Lbje;->b:Ljava/lang/Runnable;

    .line 55
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 64
    const/4 v0, 0x0

    iput-boolean v0, p0, Lbje;->e:Z

    .line 65
    iget-object v0, p0, Lbje;->a:Landroid/os/Handler;

    iget-object v1, p0, Lbje;->b:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 66
    return-void
.end method
