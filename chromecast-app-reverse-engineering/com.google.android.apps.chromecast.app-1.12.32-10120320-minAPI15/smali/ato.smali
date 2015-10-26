.class final Lato;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ladz;


# instance fields
.field private synthetic a:Ljava/lang/String;

.field private synthetic b:Latf;


# direct methods
.method constructor <init>(Latf;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 423
    iput-object p1, p0, Lato;->b:Latf;

    iput-object p2, p0, Lato;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Laef;)V
    .locals 2

    .prologue
    .line 428
    iget-object v0, p0, Lato;->b:Latf;

    .line 1066
    iget-object v0, v0, Latf;->a:Landroid/content/Context;

    .line 428
    iget-object v1, p0, Lato;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lbsn;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 429
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    .line 430
    return-void
.end method
