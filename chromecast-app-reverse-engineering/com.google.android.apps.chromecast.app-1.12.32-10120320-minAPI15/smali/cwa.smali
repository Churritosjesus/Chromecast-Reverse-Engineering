.class final Lcwa;
.super Lcvf;


# static fields
.field private static final b:Ljava/lang/String;


# instance fields
.field private final c:Lcuv;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcip;->a:Lcip;

    invoke-virtual {v0}, Lcip;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcwa;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-static {p1}, Lcuv;->a(Landroid/content/Context;)Lcuv;

    move-result-object v0

    invoke-direct {p0, v0}, Lcwa;-><init>(Lcuv;)V

    return-void
.end method

.method private constructor <init>(Lcuv;)V
    .locals 2

    sget-object v0, Lcwa;->b:Ljava/lang/String;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcvf;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    iput-object p1, p0, Lcwa;->c:Lcuv;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Map;)Lcje;
    .locals 2

    .prologue
    .line 0
    iget-object v0, p0, Lcwa;->c:Lcuv;

    .line 1000
    invoke-virtual {v0}, Lcuv;->a()V

    iget-object v1, v0, Lcuv;->a:Lbpb;

    if-nez v1, :cond_0

    const/4 v0, 0x0

    .line 0
    :goto_0
    if-nez v0, :cond_1

    invoke-static {}, Lcyh;->f()Lcje;

    move-result-object v0

    :goto_1
    return-object v0

    .line 1000
    :cond_0
    iget-object v0, v0, Lcuv;->a:Lbpb;

    .line 2000
    iget-object v0, v0, Lbpb;->a:Ljava/lang/String;

    goto :goto_0

    .line 0
    :cond_1
    invoke-static {v0}, Lcyh;->a(Ljava/lang/Object;)Lcje;

    move-result-object v0

    goto :goto_1
.end method

.method public final a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
