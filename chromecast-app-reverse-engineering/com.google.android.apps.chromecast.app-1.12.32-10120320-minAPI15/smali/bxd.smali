.class final Lbxd;
.super Ljava/lang/Object;

# interfaces
.implements Lbwh;


# instance fields
.field private synthetic a:Lbvz;

.field private synthetic b:I

.field private synthetic c:Lbwz;


# direct methods
.method constructor <init>(Lbwz;Lbvz;I)V
    .locals 0

    iput-object p1, p0, Lbxd;->c:Lbwz;

    iput-object p2, p0, Lbxd;->a:Lbvz;

    iput p3, p0, Lbxd;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 3

    iget-object v0, p0, Lbxd;->c:Lbwz;

    invoke-static {v0}, Lbwz;->a(Lbwz;)Lbxj;

    move-result-object v0

    iget-object v1, p0, Lbxd;->a:Lbvz;

    iget v2, p0, Lbxd;->b:I

    invoke-interface {v0, p1, v1, v2}, Lbxj;->a(Lcom/google/android/gms/common/ConnectionResult;Lbvz;I)V

    return-void
.end method
