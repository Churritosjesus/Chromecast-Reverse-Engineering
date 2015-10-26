.class public abstract Latt;
.super Latb;
.source "PG"


# instance fields
.field private final n:[B


# direct methods
.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;[BLadz;)V
    .locals 0

    .prologue
    .line 64
    invoke-direct {p0, p2, p3, p5}, Latb;-><init>(ILjava/lang/String;Ladz;)V

    .line 65
    iput-object p4, p0, Latt;->n:[B

    .line 1154
    iput-object p1, p0, Lads;->k:Ljava/lang/Object;

    .line 67
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 68
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ladz;)V
    .locals 6

    .prologue
    .line 35
    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Latt;-><init>(Ljava/lang/String;ILjava/lang/String;[BLadz;)V

    .line 39
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[BLadz;)V
    .locals 6

    .prologue
    .line 49
    const/4 v2, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Latt;-><init>(Ljava/lang/String;ILjava/lang/String;[BLadz;)V

    .line 53
    return-void
.end method


# virtual methods
.method protected final a(Ladp;)Lady;
    .locals 2

    .prologue
    .line 72
    iget-object v0, p1, Ladp;->b:[B

    invoke-static {p1}, La;->a(Ladp;)Ladh;

    move-result-object v1

    invoke-static {v0, v1}, Lady;->a(Ljava/lang/Object;Ladh;)Lady;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 77
    const-string v0, "application/protobuf"

    return-object v0
.end method

.method public final d()[B
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Latt;->n:[B

    return-object v0
.end method
