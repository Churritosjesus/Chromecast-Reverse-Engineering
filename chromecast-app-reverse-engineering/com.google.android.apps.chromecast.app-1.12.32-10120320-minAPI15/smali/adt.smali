.class final Ladt;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Ljava/lang/String;

.field private synthetic b:J

.field private synthetic c:Lads;


# direct methods
.method constructor <init>(Lads;Ljava/lang/String;J)V
    .locals 1

    .prologue
    .line 232
    iput-object p1, p0, Ladt;->c:Lads;

    iput-object p2, p0, Ladt;->a:Ljava/lang/String;

    iput-wide p3, p0, Ladt;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 235
    iget-object v0, p0, Ladt;->c:Lads;

    invoke-static {v0}, Lads;->a(Lads;)Laeh;

    move-result-object v0

    iget-object v1, p0, Ladt;->a:Ljava/lang/String;

    iget-wide v2, p0, Ladt;->b:J

    invoke-virtual {v0, v1, v2, v3}, Laeh;->a(Ljava/lang/String;J)V

    .line 236
    iget-object v0, p0, Ladt;->c:Lads;

    invoke-static {v0}, Lads;->a(Lads;)Laeh;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Laeh;->a(Ljava/lang/String;)V

    .line 237
    return-void
.end method
