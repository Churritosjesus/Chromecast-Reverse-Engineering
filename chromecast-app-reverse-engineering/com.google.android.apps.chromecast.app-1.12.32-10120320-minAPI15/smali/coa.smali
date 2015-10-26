.class public final Lcoa;
.super Ljava/lang/Object;


# instance fields
.field final a:Lcoh;

.field b:Z

.field c:Ljava/util/Map;

.field d:Ljava/util/Map;

.field private final e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcoh;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcoa;->b:Z

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcoa;->c:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcoa;->d:Ljava/util/Map;

    iput-object p1, p0, Lcoa;->e:Landroid/content/Context;

    iput-object p2, p0, Lcoa;->a:Lcoh;

    return-void
.end method


# virtual methods
.method public final a()Landroid/location/Location;
    .locals 2

    iget-object v0, p0, Lcoa;->a:Lcoh;

    invoke-interface {v0}, Lcoh;->a()V

    :try_start_0
    iget-object v0, p0, Lcoa;->a:Lcoh;

    invoke-interface {v0}, Lcoh;->b()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcnu;

    iget-object v1, p0, Lcoa;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcnu;->b(Ljava/lang/String;)Landroid/location/Location;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
