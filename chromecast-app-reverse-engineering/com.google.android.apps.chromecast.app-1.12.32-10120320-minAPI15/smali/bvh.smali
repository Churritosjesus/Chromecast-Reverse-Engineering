.class public final Lbvh;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lbwe;

.field public static final b:Lbvz;

.field private static d:Lbwd;

.field private static e:Lbvm;


# instance fields
.field public final c:Lbvm;

.field private final f:Ljava/lang/String;

.field private final g:I

.field private h:Ljava/lang/String;

.field private i:I

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private final l:Z

.field private final m:Lcac;

.field private final n:Lbvl;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lbwe;

    invoke-direct {v0}, Lbwe;-><init>()V

    sput-object v0, Lbvh;->a:Lbwe;

    new-instance v0, Lbvi;

    invoke-direct {v0}, Lbvi;-><init>()V

    sput-object v0, Lbvh;->d:Lbwd;

    new-instance v0, Lbvz;

    const-string v1, "ClearcutLogger.API"

    sget-object v2, Lbvh;->d:Lbwd;

    sget-object v3, Lbvh;->a:Lbwe;

    const/4 v4, 0x0

    new-array v4, v4, [Lcom/google/android/gms/common/api/Scope;

    invoke-direct {v0, v1, v2, v3, v4}, Lbvz;-><init>(Ljava/lang/String;Lbwd;Lbwe;[Lcom/google/android/gms/common/api/Scope;)V

    sput-object v0, Lbvh;->b:Lbvz;

    new-instance v0, Lckc;

    invoke-direct {v0}, Lckc;-><init>()V

    sput-object v0, Lbvh;->e:Lbvm;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLbvm;Lcac;Lbvl;)V
    .locals 3

    const/4 v0, 0x0

    const/4 v2, -0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v2, p0, Lbvh;->i:I

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lbvh;->f:Ljava/lang/String;

    invoke-static {p1}, Lbvh;->a(Landroid/content/Context;)I

    move-result v1

    iput v1, p0, Lbvh;->g:I

    iput v2, p0, Lbvh;->i:I

    iput-object p3, p0, Lbvh;->h:Ljava/lang/String;

    iput-object p4, p0, Lbvh;->j:Ljava/lang/String;

    iput-object p5, p0, Lbvh;->k:Ljava/lang/String;

    iput-boolean v0, p0, Lbvh;->l:Z

    iput-object p7, p0, Lbvh;->c:Lbvm;

    iput-object p8, p0, Lbvh;->m:Lcac;

    iput-object p9, p0, Lbvh;->n:Lbvl;

    iget-boolean v1, p0, Lbvh;->l:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lbvh;->j:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    const-string v1, "can\'t be anonymous with an upload account"

    invoke-static {v0, v1}, La;->b(ZLjava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 10
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v4, 0x0

    const/4 v2, -0x1

    const/4 v6, 0x0

    sget-object v7, Lbvh;->e:Lbvm;

    invoke-static {}, Lcad;->c()Lcac;

    move-result-object v8

    new-instance v9, Lbvl;

    invoke-direct {v9}, Lbvl;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v5, v4

    invoke-direct/range {v0 .. v9}, Lbvh;-><init>(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLbvm;Lcac;Lbvl;)V

    return-void
.end method

.method private static a(Landroid/content/Context;)I
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    iget v0, v1, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return v0

    :catch_0
    move-exception v1

    const-string v1, "ClearcutLogger"

    const-string v2, "This can\'t happen."

    invoke-static {v1, v2}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method static synthetic a(Lbvh;)I
    .locals 1

    iget v0, p0, Lbvh;->i:I

    return v0
.end method

.method static synthetic b(Lbvh;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbvh;->h:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lbvh;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbvh;->j:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lbvh;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbvh;->k:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lbvh;)Lcac;
    .locals 1

    iget-object v0, p0, Lbvh;->m:Lcac;

    return-object v0
.end method

.method static synthetic f(Lbvh;)Lbvl;
    .locals 1

    iget-object v0, p0, Lbvh;->n:Lbvl;

    return-object v0
.end method

.method public static synthetic g(Lbvh;)Z
    .locals 1

    iget-boolean v0, p0, Lbvh;->l:Z

    return v0
.end method

.method public static synthetic h(Lbvh;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbvh;->f:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic i(Lbvh;)I
    .locals 1

    iget v0, p0, Lbvh;->g:I

    return v0
.end method

.method public static synthetic j(Lbvh;)Lbvm;
    .locals 1

    iget-object v0, p0, Lbvh;->c:Lbvm;

    return-object v0
.end method
