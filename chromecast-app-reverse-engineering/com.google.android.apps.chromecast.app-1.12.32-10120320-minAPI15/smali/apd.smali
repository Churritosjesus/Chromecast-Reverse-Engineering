.class public final Lapd;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:Ljava/lang/Integer;

.field public final b:J

.field public c:Ljava/lang/Long;

.field d:Ljava/lang/Integer;

.field e:Ljava/lang/Long;

.field f:Ljava/lang/String;

.field g:Lddc;

.field public h:Laph;

.field i:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .prologue
    .line 49
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lapd;-><init>(ILjava/lang/Integer;)V

    .line 50
    return-void
.end method

.method public constructor <init>(ILjava/lang/Integer;)V
    .locals 2

    .prologue
    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lapd;->a:Ljava/lang/Integer;

    .line 54
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lapd;->b:J

    .line 55
    iput-object p2, p0, Lapd;->d:Ljava/lang/Integer;

    .line 56
    return-void
.end method


# virtual methods
.method public final a(I)Lapd;
    .locals 1

    .prologue
    .line 74
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lapd;->d:Ljava/lang/Integer;

    .line 75
    return-object p0
.end method

.method public final a(J)Lapd;
    .locals 1

    .prologue
    .line 66
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lapd;->e:Ljava/lang/Long;

    .line 67
    return-object p0
.end method

.method public final b(J)Lapd;
    .locals 1

    .prologue
    .line 83
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lapd;->c:Ljava/lang/Long;

    .line 84
    return-object p0
.end method
