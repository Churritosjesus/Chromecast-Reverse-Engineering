.class final Lcsb;
.super Ljava/lang/Object;

# interfaces
.implements Lcpu;


# instance fields
.field private final a:Lcom/google/android/gms/common/api/Status;

.field private final b:Landroid/os/ParcelFileDescriptor;

.field private final c:I

.field private final d:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/Status;Landroid/os/ParcelFileDescriptor;ZII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcsb;->a:Lcom/google/android/gms/common/api/Status;

    iput-object p2, p0, Lcsb;->b:Landroid/os/ParcelFileDescriptor;

    iput p4, p0, Lcsb;->c:I

    iput p5, p0, Lcsb;->d:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 0
    iget-object v0, p0, Lcsb;->b:Landroid/os/ParcelFileDescriptor;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcsb;->b:Landroid/os/ParcelFileDescriptor;

    .line 1000
    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public final b()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcsb;->a:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public final c()Landroid/os/ParcelFileDescriptor;
    .locals 1

    iget-object v0, p0, Lcsb;->b:Landroid/os/ParcelFileDescriptor;

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lcsb;->c:I

    return v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lcsb;->d:I

    return v0
.end method
