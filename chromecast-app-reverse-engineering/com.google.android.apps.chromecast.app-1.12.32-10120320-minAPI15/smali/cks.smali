.class public abstract Lcks;
.super Ljava/lang/Object;


# static fields
.field private static c:Ls;

.field private static d:I


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/Object;

.field private e:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    sput-object v0, Lcks;->c:Ls;

    const/4 v0, 0x0

    sput v0, Lcks;->d:I

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcks;->e:Ljava/lang/Object;

    iput-object p1, p0, Lcks;->a:Ljava/lang/String;

    iput-object p2, p0, Lcks;->b:Ljava/lang/Object;

    return-void
.end method

.method public static a()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Float;)Lcks;
    .locals 1

    new-instance v0, Lckw;

    invoke-direct {v0, p0, p1}, Lckw;-><init>(Ljava/lang/String;Ljava/lang/Float;)V

    return-object v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Integer;)Lcks;
    .locals 1

    new-instance v0, Lckv;

    invoke-direct {v0, p0, p1}, Lckv;-><init>(Ljava/lang/String;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Long;)Lcks;
    .locals 1

    new-instance v0, Lcku;

    invoke-direct {v0, p0, p1}, Lcku;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    return-object v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Lcks;
    .locals 1

    new-instance v0, Lckx;

    invoke-direct {v0, p0, p1}, Lckx;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static a(Ljava/lang/String;Z)Lcks;
    .locals 2

    new-instance v0, Lckt;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lckt;-><init>(Ljava/lang/String;Ljava/lang/Boolean;)V

    return-object v0
.end method

.method public static b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method protected abstract a(Ljava/lang/String;)Ljava/lang/Object;
.end method

.method public final c()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcks;->a:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcks;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final d()Ljava/lang/Object;
    .locals 3

    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    move-result-wide v0

    :try_start_0
    invoke-virtual {p0}, Lcks;->c()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    return-object v2

    :catchall_0
    move-exception v2

    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    throw v2
.end method
