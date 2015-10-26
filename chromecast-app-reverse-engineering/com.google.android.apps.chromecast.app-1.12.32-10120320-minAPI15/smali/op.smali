.class public Lop;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field private static final a:Lop;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 31
    new-instance v0, Lop;

    invoke-direct {v0}, Lop;-><init>()V

    sput-object v0, Lop;->a:Lop;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    return-void
.end method

.method public static a()Lop;
    .locals 1

    .prologue
    .line 46
    sget-object v0, Lop;->a:Lop;

    return-object v0
.end method

.method public static b()Loh;
    .locals 1

    .prologue
    .line 59
    new-instance v0, Loh;

    invoke-direct {v0}, Loh;-><init>()V

    return-object v0
.end method


# virtual methods
.method public c()Loo;
    .locals 1

    .prologue
    .line 72
    new-instance v0, Loo;

    invoke-direct {v0}, Loo;-><init>()V

    return-object v0
.end method
