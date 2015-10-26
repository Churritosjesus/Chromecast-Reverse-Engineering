.class public Lcno;
.super Lbyo;


# instance fields
.field public final a:Lcoh;

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lbwg;Lbwh;Ljava/lang/String;Lbyl;)V
    .locals 7

    const/16 v3, 0x17

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lbyo;-><init>(Landroid/content/Context;Landroid/os/Looper;ILbwg;Lbwh;Lbyl;)V

    new-instance v0, Lcnp;

    invoke-direct {v0, p0}, Lcnp;-><init>(Lcno;)V

    iput-object v0, p0, Lcno;->a:Lcoh;

    iput-object p5, p0, Lcno;->b:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcno;)V
    .locals 0

    invoke-virtual {p0}, Lcno;->n()V

    return-void
.end method


# virtual methods
.method protected final synthetic a(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    .prologue
    .line 0
    .line 1000
    invoke-static {p1}, Lcnv;->a(Landroid/os/IBinder;)Lcnu;

    move-result-object v0

    .line 0
    return-object v0
.end method

.method protected final c()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.location.internal.GoogleLocationManagerService.START"

    return-object v0
.end method

.method protected final d()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"

    return-object v0
.end method

.method protected final e()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "client_name"

    iget-object v2, p0, Lcno;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
