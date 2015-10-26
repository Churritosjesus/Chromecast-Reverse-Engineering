.class final Lask;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ladz;


# instance fields
.field private synthetic a:I

.field private synthetic b:J

.field private synthetic c:Lasp;

.field private synthetic d:Lash;


# direct methods
.method constructor <init>(Lash;IJLasp;)V
    .locals 1

    .prologue
    .line 374
    iput-object p1, p0, Lask;->d:Lash;

    iput p2, p0, Lask;->a:I

    iput-wide p3, p0, Lask;->b:J

    iput-object p5, p0, Lask;->c:Lasp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Laef;)V
    .locals 5

    .prologue
    .line 378
    iget-object v0, p0, Lask;->d:Lash;

    iget v1, p0, Lask;->a:I

    iget-wide v2, p0, Lask;->b:J

    iget-object v4, p0, Lask;->c:Lasp;

    invoke-static {v0, v1, v2, v3, v4}, Lash;->a(Lash;IJLasp;)V

    .line 379
    return-void
.end method
