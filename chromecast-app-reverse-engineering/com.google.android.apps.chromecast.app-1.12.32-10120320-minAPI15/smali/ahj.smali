.class final Lahj;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lagf;


# instance fields
.field private synthetic a:Lahk;

.field private synthetic b:Laga;

.field private synthetic c:Laht;

.field private synthetic d:Lahr;


# direct methods
.method constructor <init>(Lahk;Laga;Laht;Lahr;)V
    .locals 0

    .prologue
    .line 943
    iput-object p1, p0, Lahj;->a:Lahk;

    iput-object p2, p0, Lahj;->b:Laga;

    iput-object p3, p0, Lahj;->c:Laht;

    iput-object p4, p0, Lahj;->d:Lahr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lagp;)V
    .locals 4

    .prologue
    .line 946
    iget-object v0, p0, Lahj;->a:Lahk;

    iget-object v1, p0, Lahj;->b:Laga;

    iget-object v2, p0, Lahj;->c:Laht;

    iget-object v3, p0, Lahj;->d:Lahr;

    invoke-static {v0, v1, p1, v2, v3}, Lahe;->a(Lahk;Laga;Lagp;Laht;Lahr;)V

    .line 947
    return-void
.end method
