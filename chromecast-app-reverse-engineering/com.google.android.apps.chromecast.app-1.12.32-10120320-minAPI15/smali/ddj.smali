.class public abstract Lddj;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ldee;


# static fields
.field private static final a:Lddp;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 57
    invoke-static {}, Lddp;->a()Lddp;

    move-result-object v0

    sput-object v0, Lddj;->a:Lddp;

    .line 56
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a([BIILddp;)Ldea;
    .locals 3

    .prologue
    .line 114
    :try_start_0
    invoke-static {p1, p2, p3}, Lddn;->a([BII)Lddn;

    move-result-object v1

    .line 115
    invoke-virtual {p0, v1, p4}, Lddj;->a(Lddn;Lddp;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldea;
    :try_end_0
    .catch Lddx; {:try_start_0 .. :try_end_0} :catch_1

    .line 117
    const/4 v2, 0x0

    :try_start_1
    invoke-virtual {v1, v2}, Lddn;->a(I)V
    :try_end_1
    .catch Lddx; {:try_start_1 .. :try_end_1} :catch_0

    .line 121
    return-object v0

    .line 118
    :catch_0
    move-exception v1

    .line 1029
    :try_start_2
    iput-object v0, v1, Lddx;->a:Ldea;

    .line 119
    throw v1
    :try_end_2
    .catch Lddx; {:try_start_2 .. :try_end_2} :catch_1

    .line 122
    :catch_1
    move-exception v0

    .line 123
    throw v0
.end method


# virtual methods
.method public final synthetic a([B)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 21
    .line 1163
    sget-object v0, Lddj;->a:Lddp;

    .line 2158
    array-length v1, p1

    .line 3146
    const/4 v2, 0x0

    .line 3147
    invoke-direct {p0, p1, v2, v1, v0}, Lddj;->a([BIILddp;)Ldea;

    move-result-object v1

    .line 4048
    if-eqz v1, :cond_2

    invoke-interface {v1}, Ldea;->h()Z

    move-result v0

    if-nez v0, :cond_2

    .line 5028
    instance-of v0, v1, Lddg;

    if-eqz v0, :cond_0

    move-object v0, v1

    .line 5029
    check-cast v0, Lddg;

    .line 5080
    new-instance v0, Ldej;

    invoke-direct {v0}, Ldej;-><init>()V

    .line 6053
    :goto_0
    new-instance v2, Lddx;

    invoke-virtual {v0}, Ldej;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lddx;-><init>(Ljava/lang/String;)V

    .line 7029
    iput-object v1, v2, Lddx;->a:Ldea;

    .line 4051
    throw v2

    .line 5032
    :cond_0
    instance-of v0, v1, Lddi;

    if-eqz v0, :cond_1

    move-object v0, v1

    .line 5033
    check-cast v0, Lddi;

    .line 5113
    new-instance v0, Ldej;

    invoke-direct {v0}, Ldej;-><init>()V

    goto :goto_0

    .line 5037
    :cond_1
    new-instance v0, Ldej;

    invoke-direct {v0}, Ldej;-><init>()V

    goto :goto_0

    .line 21
    :cond_2
    return-object v1
.end method
