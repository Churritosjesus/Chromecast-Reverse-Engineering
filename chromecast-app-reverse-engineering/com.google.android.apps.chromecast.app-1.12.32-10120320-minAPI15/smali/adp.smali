.class public final Ladp;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field public final a:I

.field public final b:[B

.field public final c:Ljava/util/Map;

.field public final d:Z


# direct methods
.method public constructor <init>(I[BLjava/util/Map;ZJ)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput p1, p0, Ladp;->a:I

    .line 39
    iput-object p2, p0, Ladp;->b:[B

    .line 40
    iput-object p3, p0, Ladp;->c:Ljava/util/Map;

    .line 41
    iput-boolean p4, p0, Ladp;->d:Z

    .line 43
    return-void
.end method

.method public constructor <init>([BLjava/util/Map;)V
    .locals 8

    .prologue
    .line 55
    const/16 v2, 0xc8

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v7}, Ladp;-><init>(I[BLjava/util/Map;ZJ)V

    .line 56
    return-void
.end method
