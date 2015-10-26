.class public final Lddp;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field private static volatile a:Z

.field private static final b:Lddp;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 52
    sput-boolean v1, Lddp;->a:Z

    .line 131
    new-instance v0, Lddp;

    invoke-direct {v0, v1}, Lddp;-><init>(B)V

    sput-object v0, Lddp;->b:Lddp;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    .prologue
    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 113
    return-void
.end method

.method private constructor <init>(B)V
    .locals 0

    .prologue
    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 129
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 130
    return-void
.end method

.method public static a()Lddp;
    .locals 1

    .prologue
    .line 69
    sget-object v0, Lddp;->b:Lddp;

    return-object v0
.end method
